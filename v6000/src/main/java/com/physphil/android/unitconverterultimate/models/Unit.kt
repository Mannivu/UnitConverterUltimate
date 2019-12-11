package com.physphil.android.unitconverterultimate.models

import com.physphil.android.unitconverterultimate.R

sealed class Unit {
    abstract val displayStringResId: Int
}

sealed class Area(override val displayStringResId: Int) : Unit() {
    object SqKilometre : Area(R.string.sq_kilometre)
    object SqMetre : Area(R.string.sq_metre)
    object SqCentimetre : Area(R.string.sq_centimetre)
    object Hectare : Area(R.string.hectare)
    object SqMile : Area(R.string.sq_mile)
    object SqYard : Area(R.string.sq_yard)
    object SqFoot : Area(R.string.sq_foot)
    object SqInch : Area(R.string.sq_inch)
    object Acre : Area(R.string.acre)

    companion object {
        val all: List<Area> = listOf(
            SqKilometre, SqMetre, SqCentimetre, Hectare, SqMile, SqYard, SqFoot, SqInch, Acre
        )
    }
}

sealed class Mass(override val displayStringResId: Int) : Unit() {
    object Kilogram : Mass(R.string.kilogram)
    object Pound : Mass(R.string.pound)
    object Gram : Mass(R.string.gram)
    object Milligram : Mass(R.string.milligram)
    object Ounce : Mass(R.string.ounce)
    object Grain : Mass(R.string.grain)
    object Stone : Mass(R.string.stone)
    object MetricTon : Mass(R.string.metric_ton)
    object ShortTon : Mass(R.string.short_ton)
    object LongTon : Mass(R.string.long_ton)

    companion object {
        val all: List<Mass> = listOf(
            Kilogram, Pound, Gram, Milligram, Ounce, Grain, Stone, MetricTon, ShortTon, LongTon
        )
    }
}

sealed class Temperature(override val displayStringResId: Int) : Unit() {
    object Celsius : Temperature(R.string.celsius)
    object Fahrenheit : Temperature(R.string.fahrenheit)
    object Kelvin : Temperature(R.string.kelvin)
    object Rankine : Temperature(R.string.rankine)
    object Delisle : Temperature(R.string.delisle)
    object Newton : Temperature(R.string.newton)
    object Reaumur : Temperature(R.string.reaumur)
    object Romer : Temperature(R.string.romer)

    companion object {
        val all: List<Temperature> = listOf(
            Celsius, Fahrenheit, Kelvin, Rankine, Delisle, Newton, Reaumur, Romer
        )
    }
}