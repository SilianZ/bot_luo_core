package bot_luo_core.data

data class CmdData(
    var lastTime: Long,
    var totalCount: Int,
    var dayCount: Int,
    var specialCount: Int,
    var working: Boolean
)
