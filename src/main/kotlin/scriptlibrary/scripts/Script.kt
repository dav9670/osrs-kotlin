package scriptlibrary.scripts

import org.dreambot.api.script.AbstractScript
import org.jgrapht.Graph
import org.jgrapht.graph.AsWeightedGraph
import scriptlibrary.edges.ActionEdge
import scriptlibrary.utilities.GraphVisualizer
import scriptlibrary.vertices.ActionVertex

abstract class Script(val showGraph: Boolean = false) : AbstractScript() {
    private lateinit var graph: Graph<ActionVertex, ActionEdge>
    private lateinit var currentVertex: ActionVertex

    /**
     * Construct the graph and returns the start node
     */
    abstract fun initGraph(): Graph<ActionVertex, ActionEdge>

    final override fun onStart() {
        val backingGraph = initGraph()
        graph = AsWeightedGraph(backingGraph, { edge: ActionEdge ->
            edge.weight
        }, false, false)

        if (showGraph) {
            val visualizer = GraphVisualizer(graph)
            visualizer.showWindow()
        }
    }

    final override fun onLoop(): Int {
        return 1000
    }
}