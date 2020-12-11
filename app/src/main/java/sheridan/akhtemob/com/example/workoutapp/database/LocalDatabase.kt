package sheridan.akhtemob.com.example.workoutapp.database

import androidx.room.Database
import androidx.room.RoomDatabase
import sheridan.akhtemob.com.example.workoutapp.dataModels.FreeWeightsEntryModel
import sheridan.akhtemob.com.example.workoutapp.dataModels.JoggingEntryModel

@Database(
    entities = [JoggingEntryModel::class, FreeWeightsEntryModel::class],
    version = 1,
    exportSchema = false
)
abstract class LocalDatabase : RoomDatabase() {
    abstract fun getDao(): LocalRepositoryDao
}