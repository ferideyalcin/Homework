# Ödev: Java – Temel Karar Yapıları 1

> Bu bir ödev şablonudur. Ödevi **yapay zekâ kullanmadan**, kendi başınıza yapmanız beklenir.

Bu ödevde `if`, `else if`, `else` ve `switch` yapılarını kullanarak 10 problemi çözeceksiniz. Her soru birbirinden bağımsızdır.

## Repo Yapısı

```
.
├── README.md                      -> Ödev tanımı (bu dosya)
├── RAPOR.md                       -> Test sonuçlarını yazacağınız rapor
└── src/
    ├── Soru01_TekMiCift.java
    ├── ...
    └── Soru10_HaftaninGunu.java   -> Her soru için ayrı sınıf
```

## Nasıl Çalıştırılır?

```bash
javac src/Soru01_TekMiCift.java
java -cp src Soru01_TekMiCift
```

## Sorular

1. **Tek mi, Çift mi?** Girilen sayının tek mi çift mi olduğunu belirleyin.
2. **Pozitif, Negatif veya Sıfır:** Girilen sayının pozitif, negatif veya sıfır olduğunu belirleyin.
3. **İki Sayının Büyüğü:** İki sayıdan hangisinin büyük olduğunu belirleyin. Eşitse bunu da belirtin.
4. **Üç Sayının En Büyüğü:** Üç sayı arasından en büyüğünü bulun. Eşitlik durumlarını da değerlendirin.
5. **Not Değerlendirme:** 0–100 arası notu harf notuna çevirin. Geçersiz girişleri kontrol edin.

   | Not | Harf |
   |---|---|
   | 90–100 | AA |
   | 80–89 | BA |
   | 70–79 | BB |
   | 60–69 | CB |
   | 50–59 | CC |
   | 0–49 | FF |

6. **Artık Yıl Kontrolü:** Girilen yılın artık yıl olup olmadığını belirleyin.
7. **Bölünebilme Kontrolü:** Girilen sayının 3'e, 5'e ve hem 3'e hem 5'e bölünüp bölünmediğini belirleyin.
8. **Basit Hesap Makinesi:** İki sayı ve bir işlem (`+`, `-`, `*`, `/`) alıp sonucu hesaplayın. Geçersiz işlem ve sıfıra bölmeyi kontrol edin.
9. **Üçgen Türü Belirleme:** Üç kenar uzunluğu alın. Önce üçgen oluşup oluşmadığını kontrol edin, sonra eşkenar, ikizkenar veya çeşitkenar olduğunu belirleyin.
10. **Haftanın Günü:** 1–7 arası sayıya karşılık gelen günü `switch` ile yazdırın. Geçersiz girişleri kontrol edin.

## Teslim Kuralları

- 10 sorunun tamamı çözülmelidir.
- Her soru ayrı bir sınıf olmalıdır (şablonda hazır).
- Kodlar okunabilir ve düzenli olmalıdır.
- Her soru için **en az 2 farklı test** yapıp `RAPOR.md` dosyasına yazın.
- Geçersiz girişleri ve sınır durumlarını göz önünde bulundurun.

Bu repoyu kendi hesabınıza kopyalayın, çalışmanızı commit'leyip sistemin belirttiği şekilde teslim edin.
