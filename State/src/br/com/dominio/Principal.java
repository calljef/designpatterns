package br.com.dominio;

import br.com.dominio.mariostate.MarioInvencivel;
import br.com.dominio.state.State;

public class Principal {

	public static void main(String[] args) {

		State mario = new MarioInvencivel();

		mario = mario.pegarCogumelo();
		mario = mario.pegarFlorDeFogo();
		mario = mario.pegarCogumelo();
		
		mario = mario.colidirComInimigo();
		mario = mario.colidirComInimigo();
		mario = mario.colidirComInimigo();

		System.out.println();
		System.out.println("Estado final: " + mario.retornarTipo());

	}

}