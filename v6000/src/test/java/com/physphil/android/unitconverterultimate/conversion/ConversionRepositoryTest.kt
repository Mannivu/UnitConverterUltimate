package com.physphil.android.unitconverterultimate.conversion

import com.google.common.truth.Truth.assertThat
import com.physphil.android.unitconverterultimate.models.Area
import com.physphil.android.unitconverterultimate.models.Measurement
import org.junit.Before
import org.junit.Test
import java.math.BigDecimal
import java.math.RoundingMode

class ConversionRepositoryTest {

    private lateinit var repo: ConversionRepository

    @Before
    fun setup() {
        repo = ConversionRepository()
    }

    @Test
    fun `test area conversion`() {
        val value = BigDecimal("5.5")
        val from = Area.SqMetre
        val to = Area.SqYard
        val result = repo.convert(value, from, to).setScale(2, RoundingMode.UP)
        assertThat(result).isEqualToIgnoringScale(6.58.toBigDecimal())
    }

    @Test
    fun `test Measurement`() {
        val measurement = Measurement<Area>(BigDecimal("5.5"), Area.SqMetre)
        val result = measurement.to(Area.SqYard).value.setScale(2, RoundingMode.UP)
        assertThat(result).isEqualToIgnoringScale(6.58.toBigDecimal())
    }
}