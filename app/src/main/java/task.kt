import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import java.sql.Date

@Parcelize
data class task(
    var nama : String,
    var tanggal : String,
    var deskripsi : String,
    var status : String
) : Parcelable
