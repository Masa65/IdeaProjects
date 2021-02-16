class Map(_number: Int) {
    val number: Int = _number //マップの番号（解放順）
    var steps: Int = 0

    fun process() {
        this.steps ++
        this.action((0..3).random())
    }

    fun action(number: Int) {
        when (number) {
            0 -> {
                //味方の回復
                println("${this.name} : 回復")
            }

            1 -> {
                //味方にダメージ
                println("${this.name} : ダメージ")
            }

            2 -> {
                //アイテム
                println("${this.name} : アイテム")
            }

            3 -> {
                //敵と遭遇
                println("${this.name} : 敵と遭遇")
            }
        }
    }
}