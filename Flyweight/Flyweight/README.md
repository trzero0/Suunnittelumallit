Tämä koodi tarkastelee String-olioiden vertailua Java-ohjelmointikielessä. Se käyttää erilaisia tapoja luoda merkkijonoja ja vertailla niitä:

-Luodaan kaksi merkkijonomuuttujaa fly ja weight, sekä kaksi vastaavaa muuttujaa fly2 ja weight2. 

-Ensimmäisessä vertailussa osoitetaan, että ne viittaavat samaan String-instanssiin.

-Tulostetaan totuusarvot siitä, viittaavatko fly ja fly2 sekä weight ja weight2 samaan String-instanssiin.

-Luodaan uusi merkkijono distinctString yhdistämällä fly ja weight. Tulostetaan totuusarvo siitä, viittaako se samaan instanssiin kuin suoraan kirjoitettu "flyweight".

-Käytetään intern()-metodia luomaan uusi merkkijono flyweight, joka on tallennettu String-pooliin. Tulostetaan totuusarvo siitä, viittaako se samaan instanssiin kuin suoraan kirjoitettu "flyweight".