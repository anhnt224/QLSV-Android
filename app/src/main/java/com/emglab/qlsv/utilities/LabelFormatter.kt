package com.emglab.qlsv.utilities

import com.github.mikephil.charting.components.AxisBase
import com.github.mikephil.charting.formatter.IAxisValueFormatter


class LabelFormatter: IAxisValueFormatter {
    private lateinit var mLabels: Array<String>

    fun labelFormatter(labels: Array<String>) {
        mLabels = labels
    }

    override fun getFormattedValue(value: Float, axis: AxisBase?): String? {
        return mLabels[value.toInt()]
    }
}