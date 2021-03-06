package com.github.rongi.klaster

import android.support.v7.widget.RecyclerView
import android.support.v7.widget.RecyclerView.ViewHolder

object Klaster {

  /**
   * Returns new [KlasterBuilder].
   */
  fun get(): KlasterBuilder = KlasterBuilder()

  /**
   * Returns new [KlasterBuilderWithViewHolder].
   *
   * It is intended for the cases when you need a custom [ViewHolder].
   */
  fun <VH : RecyclerView.ViewHolder> withViewHolder(): KlasterBuilderWithViewHolder<VH> = KlasterBuilderWithViewHolder()

}

class StekkerException(override val message: String) : RuntimeException()
