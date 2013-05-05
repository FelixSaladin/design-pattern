package biz.ezcom.design.pattern.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * 围棋享元工厂
 */
public final class ChessFactory {
    /** 围棋工厂单例 */
    private static ChessFactory              instance;
    /** 围棋的享元Map */
    private final Map<String, AbstractChess> flyweightMap;

    private ChessFactory() {
        this.flyweightMap = new HashMap<String, AbstractChess>();
        this.flyweightMap.put("black", new BlackChess());
        this.flyweightMap.put("white", new WhiteChess());
    }

    public static ChessFactory getInstance() {
        if (ChessFactory.instance == null) {
            synchronized (ChessFactory.class) {
                if (ChessFactory.instance == null) {
                    ChessFactory.instance = new ChessFactory();
                }
            }
        }
        return ChessFactory.instance;
    }

    public AbstractChess getChess(final String color) {
        return this.flyweightMap.get(color);
    }
}
