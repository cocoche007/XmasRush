package com.codingame.game.Controller;

import com.codingame.game.Item;
import com.codingame.game.Model.TileModel;
import com.codingame.game.Utils.Vector2;
import com.codingame.game.View.TileView;

public class TileController {
    private TileModel model;
    private TileView view;

    public TileController(TileModel model, TileView view) {
        this.model = model;
        this.view = view;
    }

    public void setPattern(String pattern) {
        model.pattern = pattern;

        init();
    }

    public void rotate(int numTimes) {
        // shift characters to the right - 1 shift corresponds to a 90 deg rotation
        numTimes %= model.pattern.length();
        if (numTimes == 0) {
            return;
        }
        model.pattern = model.pattern.substring(model.pattern.length() - numTimes)
                + model.pattern.substring(0, model.pattern.length() - numTimes);

        view.rotate(numTimes);
    }

    public void setPosInMap(Vector2 pos) {
        model.pos = pos;
        view.setPosInMap(pos.y, pos.x);
    }

    public void setPosAbsolute(Vector2 pos) {
        model.pos = Vector2.INVALID;
        view.setPosAbsolute(pos.x, pos.y);
    }

    public void init() {
        view.init(this.model);
    }

    public void addItem(Item item) {
        model.putItem(item);
        view.addItem(item);
    }

    public boolean isBaseTile() {
        return model.isBaseTile();
    }

    public boolean isEmpty() {
        return model.isEmpty();
    }

    public boolean isCenterTile() {
        return model.isCenterTile();
    }

    public boolean hasItem() {
        return model.hasItem();
    }

    public Item getItem() {
        return model.item;
    }

    public Vector2 getPos() {
        return model.pos;
    }
}
