package com.github.andreysoft.affirmations.data

import com.github.andreysoft.affirmations.R
import com.github.andreysoft.affirmations.model.Affirmation

class Datasource
{
    fun loadAffirmations(): List<com.github.andreysoft.affirmations.model.Affirmation>
    {
        return listOf<com.github.andreysoft.affirmations.model.Affirmation>(
            Affirmation(R.string.affirmation1, R.drawable.image1),
            Affirmation(R.string.affirmation2, R.drawable.image2),
            Affirmation(R.string.affirmation3, R.drawable.image3),
            Affirmation(R.string.affirmation4, R.drawable.image4),
            Affirmation(R.string.affirmation5, R.drawable.image5),
            Affirmation(R.string.affirmation6, R.drawable.image6),
            Affirmation(R.string.affirmation7, R.drawable.image7),
            Affirmation(R.string.affirmation8, R.drawable.image8),
            Affirmation(R.string.affirmation9, R.drawable.image9),
            Affirmation(R.string.affirmation10, R.drawable.image10))
    }
}