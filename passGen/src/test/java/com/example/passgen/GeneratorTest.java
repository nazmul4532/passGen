package com.example.passgen;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GeneratorTest {

    private Password password;
    private Alphabet firstAlphabet;
    private Alphabet secondAlphabet;
    private Generator generator;

    @BeforeEach
    public void setup() {
        password = new Password("Secret");
        firstAlphabet = new Alphabet(true, false, false, false);
        secondAlphabet = new Alphabet(false, true, true, true);
        generator = new Generator(true, false, false, false);
    }

    @Test
    public void passwordToStringShouldReturnValue() {
        assertEquals("Secret", password.toString());
    }

    @Test
    public void uppercaseAlphabetPoolShouldMatchConstant() {
        assertEquals(Alphabet.UPPERCASE_LETTERS, firstAlphabet.getAlphabet());
    }

    @Test
    public void lowercaseNumberSymbolPoolShouldCombineCorrectly() {
        assertEquals(Alphabet.LOWERCASE_LETTERS + Alphabet.NUMBERS + Alphabet.SYMBOLS, secondAlphabet.getAlphabet());
    }

    @Test
    public void generatorAlphabetShouldInitializeWithUppercase() {
        assertEquals(Alphabet.UPPERCASE_LETTERS, generator.getAlphabet().getAlphabet());
    }

    @Test
    public void generatorAlphabetLengthShouldBe26() {
        assertEquals(26, generator.getAlphabet().getAlphabet().length());
    }

    @Test
    public void generatePasswordShouldReturnPasswordOfRequestedLength() {
        Password generatedPassword = generator.generatePassword(10);
        assertNotNull(generatedPassword);
        assertEquals(10, generatedPassword.toString().length());
    }
}
