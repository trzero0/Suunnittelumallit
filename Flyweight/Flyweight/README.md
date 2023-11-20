## Koodin Tarkoitus:

Tämä Java-koodi tutkii merkkijonojen vertailua ja käyttää String-luokan ominaisuuksia, kuten String-poolia ja intern-metodia.

Koodin Toiminta Askeltain:

-Aluksi luodaan neljä merkkijonomuuttujaa: fly, weight, fly2 ja weight2.

-Ensimmäisessä vertailussa tarkistetaan, ovatko fly ja fly2 sekä weight ja weight2 samat String-instanssit. Tuloksena on true, koska String-pooli mahdollistaa merkkijonojen uudelleenkäytön.

-Toisessa vertailussa luodaan uusi merkkijono distinctString yhdistämällä fly ja weight. Tuloksena on false, koska tämä uusi merkkijono ei viittaa samaan instanssiin kuin suoraan kirjoitettu "flyweight".

-Kolmannessa vaiheessa käytetään intern()-metodia luomaan uusi merkkijono flyweight, joka on tallennettu String-pooliin. Tuloksena on true, koska nyt flyweight ja suoraan kirjoitettu "flyweight" viittaavat samaan instanssiin.

## Johtopäätökset:

Koodi osoittaa String-olioiden vertailun eri tapoja ja korostaa String-poolin käyttäytymistä. intern()-metodi mahdollistaa merkkijonojen tallentamisen String-pooliin, mikä voi vaikuttaa vertailutuloksiin. On tärkeää olla tietoinen String-olioiden vertailusta ja String-poolin käytöstä erilaisissa tilanteissa.
