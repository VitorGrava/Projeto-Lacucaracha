package io.github.badlogic.projetolacucaracha;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector2;

public class personagem{
    private final Vector2[] posicoes;
    private Texture personagem_principal;
    private int posicao_inicial;
    float velocidade = 2000;

    public personagem(Texture personagem_principal, float inicioX, float inicioY)
    {
        this.personagem_principal = personagem_principal;
        posicoes = new Vector2[]{
            new Vector2(100, 590),
            new Vector2(86, 708),
            new Vector2(89,789)
        };
    }
    public void movimentacao()
    {

    }
}

