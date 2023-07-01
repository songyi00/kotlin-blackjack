package blackjack.view

class InputView {
    fun requestNameOfPlayers(): List<String> {
        println("게임에 참여할 사람의 이름을 입력하세요.(쉼표 기준으로 분리)")
        return readln().split(",")
            .map { it.trim() }
            .toList()
    }

    fun requestReceiveAdditionalCard(playerName: String): Boolean {
        println("${playerName}는 한장의 카드를 더 받겠습니까?")
        return when (readln()) {
            "y" -> true
            else -> false
        }
    }
}