package org.avo.aisdemo.bodymetrics.domain

import org.avo.aisdemo.medicalrecord.common.BodyMetricsId

data class BodyMetrics(
    val id: BodyMetricsId = BodyMetricsId(),
    val version: String,
    val bodyHeight: String,
    val bellyCircumference: String,
    val headCircumference: String,
    val bodyFat: String
) {
    fun toDisplay(): String {
        return "Body Height: " + bodyHeight +
                " Belly Circumference: " + bellyCircumference +
                " Head Circumference: " + headCircumference +
                " Body Fat: " + bodyFat
    }
}

