package biz.ezcom.design.pattern.memento;

/***
 * 客户端
 */
public final class Client {
    private Client() {}

    public static void main(final String[] args) {
        // 游戏状态
        final int attack = 100;
        final int defense = 100;
        final int ditality = 100;
        final State state = new State(attack, defense, ditality);
        // 开始游戏
        final OriginatorGame game = new OriginatorGame(state);
        game.show();// 显示状态
        game.play();
        final Memento memento = game.saveMemento();// 保存状态
        final CareTaker careTaker = new CareTaker(memento);
        game.play();
        game.play();
        game.show();
        game.loadMemento(careTaker.getMemento());// 加载状态
        game.show();
    }
}
