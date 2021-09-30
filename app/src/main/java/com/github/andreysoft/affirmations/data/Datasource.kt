package com.github.andreysoft.affirmations.data

import com.github.andreysoft.affirmations.R
import com.github.andreysoft.affirmations.model.Affirmation

class Datasource
{
    fun loadAffirmations(): List<com.github.andreysoft.affirmations.model.Affirmation>
    {
        return listOf<com.github.andreysoft.affirmations.model.Affirmation>(
            Affirmation(R.string.affirmation1),
            Affirmation(R.string.affirmation2),
            Affirmation(R.string.affirmation3),
            Affirmation(R.string.affirmation4),
            Affirmation(R.string.affirmation5),
            Affirmation(R.string.affirmation6),
            Affirmation(R.string.affirmation7),
            Affirmation(R.string.affirmation8),
            Affirmation(R.string.affirmation9),
            Affirmation(R.string.affirmation10))
    }
}