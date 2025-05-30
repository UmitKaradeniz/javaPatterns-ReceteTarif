
# Reçete ve Yemek Tarifi Yönetimi

Java dilinde geliştirilen bu proje, yemek tariflerini oluşturmak, malzemeleri düzenlemek, tarif bileşenlerini birleştirmek ve kullanıcıları değişikliklerden haberdar etmek için tasarlanmıştır. Yazılım geliştirme sürecinde **Factory Method**, **Decorator**, **Composite** ve **Observer** tasarım desenleri kullanılmıştır.

## 🎯 Amaç

- Tariflerin türlerine göre oluşturulması
- Malzemelerin dinamik olarak eklenip çıkarılması
- Alt tarif ve bileşenlerin birleşik yapıda gösterilmesi
- Tarif değişikliklerinde kullanıcıların bilgilendirilmesi



## 📂 Proje Yapısı

```
src/
├── factory/         → Tarif oluşturucuları
├── decorator/       → Malzeme ve eklenti yapıları
├── composite/       → Tarif - malzeme birleşimi
├── observer/        → Gözlemci yapısı
└── main/            → Uygulama başlangıç noktası
```



## 📄 Lisans

Bu proje MIT lisansı ile lisanslanmıştır. Detaylar için `LICENSE` dosyasına göz atabilirsiniz.
