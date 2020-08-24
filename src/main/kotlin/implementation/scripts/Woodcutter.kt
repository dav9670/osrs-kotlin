package implementation.scripts

import implementation.nodes.WoodcutterVertex
import org.dreambot.api.script.Category
import org.dreambot.api.script.ScriptManifest
import org.jgrapht.Graph
import org.jgrapht.graph.WeightedPseudograph
import scriptlibrary.edges.ActionEdge
import scriptlibrary.scripts.Script
import scriptlibrary.vertices.ActionVertex

@ScriptManifest(author = "clocknot", category = Category.WOODCUTTING, name = "woodkot", version = 1.0)
class Woodcutter : Script(showGraph = true) {
    override fun initGraph(): Graph<ActionVertex, ActionEdge> {
        val graph = WeightedPseudograph<ActionVertex, ActionEdge>(ActionEdge::class.java)

        val wood = WoodcutterVertex()
        graph.addVertex(wood)

        return graph
    }
}