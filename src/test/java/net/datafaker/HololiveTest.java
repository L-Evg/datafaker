package net.datafaker;

import org.junit.jupiter.api.Test;

import java.util.Locale;

import static org.assertj.core.api.Assertions.assertThat;

public class HololiveTest extends AbstractFakerTest {

    private static final Faker JA_FAKER = new Faker(new Locale("ja"));

    @Test
    void talent() {
        assertThat(faker.hololive().talent()).matches("^[A-Za-z '+-]+$");
    }

    @Test
    void talent_jaLocale() {
        assertThat(JA_FAKER.hololive().talent()).matches("^AZKi|[\\u3040-\\u30FF\\u4E00-\\u9FAF]+$");
    }
}
