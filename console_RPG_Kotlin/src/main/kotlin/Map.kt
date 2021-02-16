class Map(_number: Int) {
    val number = _number //マップの番号（解放順）
    var steps = 0

    fun _mapStart() {
        println("~~~~ フィールド${this.number} ~~~~")
    }

    fun _goFront() {
        this.steps ++
    }
}