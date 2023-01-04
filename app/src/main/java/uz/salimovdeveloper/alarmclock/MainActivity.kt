package uz.salimovdeveloper.alarmclock

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.RequiresApi
import uz.salimovdeveloper.alarmclock.databinding.ActivityMainBinding
import java.io.BufferedReader
import java.io.InputStreamReader

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    @RequiresApi(Build.VERSION_CODES.N)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        // Set the input and output filenames
        val inputFilename = "input.mp4"
        val outputFilename = "output.mp4"



// Set the filter options
        val filterOptions = "-vf curves=r='0/255':g='0/255':b='0/255'"



// Build the ffmpeg command
        val command = arrayOf("ffmpeg", "-i", inputFilename, filterOptions, "-y", outputFilename)



// Call ffmpeg
//        val process = ProcessBuilder(*command)
//            .redirectErrorStream(true)
//            .start()



// Print the ffmpeg output
//        BufferedReader(InputStreamReader(process.inputStream)).use { reader ->
//            reader.lines().forEach {

            }
//        }
//    }
}