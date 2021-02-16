class Map(_number: Int) {
    val number = _number //マップの番号（解放順）
    var steps = 0

    fun _mapStart() {
        fieldLog("~~~~ フィールド${this.number} ~~~~")
    }

    fun _goFront() {
        this.steps++
    }

    fun process() {
        this.steps ++
        this.action((0..6).random())
    }

    fun fieldLog(message: String) {
        println("$message")
        Thread.sleep(2500)
    }

    fun action(number: Int) {
        when (number) {
            0 -> {
                //味方の回復
                fieldLog("回復")
            }

            1 -> {
                //味方にダメージ
                fieldLog("ダメージ")
            }

            2 -> {
                //アイテム
                fieldLog("アイテム")
            }

            3 -> {
                //敵と遭遇
                fieldLog("敵と遭遇")
            }

            4, 5, 6 -> {
                //特になにもない
                fieldLog("Nothing")
            }
        }
    }
}