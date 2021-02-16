package guiPractice

import scalafx.application.JFXApp
import scalafx.application.JFXApp.PrimaryStage
import scalafx.scene.Scene
import scalafx.scene.chart.{LineChart, NumberAxis, XYChart}
import scalafx.collections.ObservableBuffer

object LineChartSample extends JFXApp {

	// Defining the axes
	val xAxis = new NumberAxis()
	xAxis.label = "Number of Month"
	val yAxis = new NumberAxis()

	// Creating the chart
	val lineChart = LineChart(xAxis, yAxis)

	lineChart.title = "Stock Monitoring, 2010"

	// defining a series
	val data = ObservableBuffer(Seq(
		(1, 23),
		(2, 14),
		(3, 15),
		(4, 24),
		(5, 34),
		(6, 36),
		(7, 22),
		(8, 45),
		(9, 43),
		(10, 17),
		(11, 29),
		(12, 25)
	) map {case (x, y) => XYChart.Data[Number, Number](x, y)})

	val series = XYChart.Series[Number, Number]("test", data)

	lineChart.getData.add(series)

	stage = new PrimaryStage {
		title = "Line Chart Sample"
		scene = new Scene(800, 600) {
			root = lineChart
		}
	}
}