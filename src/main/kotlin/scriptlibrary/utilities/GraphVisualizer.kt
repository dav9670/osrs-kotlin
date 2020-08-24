package scriptlibrary.utilities

import com.mxgraph.layout.mxCircleLayout
import com.mxgraph.layout.mxIGraphLayout
import com.mxgraph.swing.mxGraphComponent
import org.jgrapht.Graph
import org.jgrapht.ext.JGraphXAdapter
import javax.swing.JApplet
import javax.swing.JFrame


class GraphVisualizer<V, E>(private val graph: Graph<V, E>) : JApplet() {
    fun showWindow() {
        val frame = JFrame("DemoGraph")
        frame.defaultCloseOperation = JFrame.DISPOSE_ON_CLOSE

        val graphAdapter = JGraphXAdapter(graph)

        val layout: mxIGraphLayout = mxCircleLayout(graphAdapter)
        layout.execute(graphAdapter.defaultParent)

        frame.add(mxGraphComponent(graphAdapter))

        frame.pack()
        frame.isLocationByPlatform = true
        frame.isVisible = true
    }
}