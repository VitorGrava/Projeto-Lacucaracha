package io.github.badlogic.projetolacucaracha;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

/** {@link com.badlogic.gdx.ApplicationListener} implementation shared by all platforms. */
public class Core extends ApplicationAdapter {
    private SpriteBatch batch;
    private Texture fundo_tela;
    private Texture personagem_principal;
    @Override
    public void create() {
        batch = new SpriteBatch();
        fundo_tela = new Texture("mapa_fase.png");
        personagem_principal = new Texture("personagem_principal.png");
    }

    @Override
    public void render() {
        ScreenUtils.clear(0.15f, 0.15f, 0.2f, 1f);
        batch.begin();
        batch.draw(fundo_tela, 0, 0);
        batch.draw(personagem_principal, 0, 0);
        batch.end();
    }


    @Override
    public void dispose() {
        batch.dispose();
        fundo_tela.dispose();
    }
}

