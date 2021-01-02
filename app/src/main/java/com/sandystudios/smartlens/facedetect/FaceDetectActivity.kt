package com.sandystudios.smartlens.facedetect

import android.os.Bundle
import androidx.core.content.ContextCompat
import com.sandystudios.smartlens.BaseLensActivity

class FaceDetectActivity : BaseLensActivity() {
    override val imageAnalyzer = FaceDetectAnalyzer()

    override fun startScanner() {
        startFaceDetect()
    }

    private fun startFaceDetect() {
        imageAnalysis.setAnalyzer(
            ContextCompat.getMainExecutor(this),
            imageAnalyzer
        )
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
}