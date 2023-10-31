package com.uchi.snackbar.utils

import android.content.Context
import android.util.DisplayMetrics
import android.widget.Toast
import androidx.annotation.StringRes

object UI {
    fun showThemedToast(context: Context, text: String, shortLength: Boolean) {
        Toast.makeText(context, text, if (shortLength) Toast.LENGTH_SHORT else Toast.LENGTH_LONG).show()
    }

    fun showThemedToast(context: Context, text: CharSequence, shortLength: Boolean) {
        showThemedToast(context, text.toString(), shortLength)
    }

    fun showThemedToast(context: Context, @StringRes textResource: Int, shortLength: Boolean) {
        Toast.makeText(context, textResource, if (shortLength) Toast.LENGTH_SHORT else Toast.LENGTH_LONG).show()
    }
    /**
     * This method converts dp unit to equivalent pixels, depending on device density.
     *
     * @param dp A value in dp (density independent pixels) unit.
     * @param context Context to get resources and device specific display metrics.
     * @return A float value to represent px value which is equivalent to the passed dp value.
     */
    fun convertDpToPixel(dp: Float, context: Context): Float {
        return dp * (context.resources.displayMetrics.densityDpi.toFloat() / DisplayMetrics.DENSITY_DEFAULT)
    }
}
