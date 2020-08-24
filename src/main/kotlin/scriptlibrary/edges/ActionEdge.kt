package scriptlibrary.edges

import org.jgrapht.Graph
import scriptlibrary.vertices.ActionVertex

class ActionEdge(private val from: ActionVertex, private val to: ActionVertex) {
    val weight: Double
        get() = from.priority + to.priority

    override fun toString(): String {
        return "from: $from, to: $to, weight: $weight"
    }
}

fun Graph<ActionVertex, ActionEdge>.addActionEdge(from: ActionVertex, to: ActionVertex) {
    val edge = ActionEdge(from, to)
    this.addEdge(from, to, edge)
}