/*
 *  This file is part of Alfred Library.
 *
 *  Alfred Library is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  Alfred Library is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with Alfred Library.  If not, see <http://www.gnu.org/licenses/>.
 */
package br.com.twsoftware.alfred.email;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Classe utilit�ria para Emails.
 * 
 * @author Marlon Silva Carvalho
 * @since 03/06/2009
 */
final public class Email {

	private Email() {
	}

	/**
	 * Verificar se um e-mail � v�lido.
	 * 
	 * @param email E-mail a ser validado.
	 * @return Verdadeiro caso seja v�lido. Falso, caso contr�rio.
	 */
	public static boolean isValido(String email) {
		Pattern pattern = Pattern.compile (
		         "([a-zA-Z0-9_\\-\\.]+)@((\\[a-z]{1,3}\\.[a-z]"
		         + "{1,3}\\.[a-z]{1,3}\\.)|(([a-zA-Z\\-]+\\.)+))"
		         + "([a-zA-Z]{2,4}|[0-9]{1,3})(\\]?)", 
		         Pattern.MULTILINE);
		Matcher m=pattern.matcher(email);
		return m.matches();
	}

}