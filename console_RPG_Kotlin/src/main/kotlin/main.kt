//登場キャラクターを予めキャラクタクラスのインスタンスとして宣言しておく
val king = Character("国王")
val first = Map(1)

fun main() {
    startingGame()
    val first = Map(1)
    first._mapStart()
    for (i in 1..10) {
        first.process()
    }
}

fun startingGame() {
    king.talk("よくぞ来てくれた、勇者、、、")
    king.talk("ええと、名前を何と言ったか、、")
    king.talk("済まないが今一度名前を名乗ってはもらえないか")

    //名前を入力させる
    print("プレイヤーの名前を入力してください : ")
    val player = Player(readLine())

    king.talk("おお！、そうであったそうであった、いや覚えておったよ？ただちょっと今あのその...")
    king.talk("ゴッホン...では改めて、勇者${player.name}よ、")
    king.talk("悪しき魔王を討ち、国に平和をもたらすのだ!!!")
}