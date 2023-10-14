package org.avo.aisdemo.medicalrecord.application

import org.avo.aisdemo.base.util.application.BaseApplicationService
import org.avo.aisdemo.medicalrecord.common.BodyMetricsId
import org.avo.aisdemo.base.util.id.PatientId
import org.avo.aisdemo.base.util.access.AccessType
import org.avo.aisdemo.base.util.tenant.TenantId
import org.avo.aisdemo.bodymetrics.application.BodyMetricsData
import org.avo.aisdemo.bodymetrics.config.BodyMetricsAccess
import org.avo.aisdemo.bodymetrics.domain.BodyMetrics
import org.avo.aisdemo.medicalrecord.domain.MedicalRecord
import org.springframework.stereotype.Service



@Service
class ApplicationService() : BaseApplicationService() {


    fun findById(id: String?): MedicalRecord? {

    }

    /**
     * list all available record types
     */
    fun createMetrics(tenantId: TenantId, patientId: PatientId, data: BodyMetricsData): Result<BodyMetrics> =
        doWith(AccessType.WRITE, BodyMetricsAccess) {
            success(BodyMetrics(BodyMetricsId(), "", data.bodyHeight, data.headCircumference, data.bodyFat, data.bellyCircumference).also {                // store in repo-*
            })
        }


    fun updateMetrics(bodyMetricsId: BodyMetricsId, data: BodyMetricsData): BodyMetrics {
        // Write Access, Logging, Tx, Events?

        return BodyMetrics(BodyMetricsId(), "", data.bodyHeight, data.headCircumference, data.bodyFat, data.bellyCircumference).also {
            // store in repo
        }
    }

    fun getMetrics(bodyMetricsId: BodyMetricsId): BodyMetrics {
        // Read Access, Logging, keine Tx Nötig


        TODO()
    }

    fun getAllMetricsFor(patientId: PatientId): BodyMetrics {

        TODO()
    }



    // Liste alle Metrics einer Person

}
