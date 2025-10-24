# Responsi 1 Mobile

**Nama:** Anas Shn  
**NIM:** H1D023103  
**Kelas:** H1D023103  
**Mata Kuliah:** Praktikum Pemrograman Mobile

## Deskripsi

Aplikasi Android untuk menampilkan info klub Moreirense FC menggunakan API Football-Data.org. Arsitektur MVVM dengan Retrofit dan Glide.

## Fitur

- **MainActivity**: Logo, nama, deskripsi klub.
- **CoachActivity**: Info coach dengan background image dan card transparan.
- **PlayerActivity**: List pemain (RecyclerView) dengan warna berdasarkan posisi; klik untuk bottomsheet detail (Glide).
- **HistoryActivity**: Sejarah klub dalam ScrollView.
- **Navigation**: Tombol back di setiap activity.

## Alur API

1. **Postman**: Test GET request ke `https://api.football-data.org/v2/teams/583` dengan header `X-Auth-Token`, dapatkan JSON response (coach & squad).
2. **Retrofit**: Kirim request sama, parse JSON ke `SearchResponse` dengan Gson.
3. **ViewModel**: Fetch data, post ke LiveData.
4. **UI**: Observe LiveData, tampilkan di RecyclerView/Card.

## Teknologi

- Kotlin, Android SDK, ViewBinding/DataBinding.
- Retrofit, Gson, Glide.
- RecyclerView, BottomSheetDialogFragment.
- MVVM, LiveData.

## Cara Run

1. Clone repo.
2. Buka di Android Studio.
3. JDK 11/17, min SDK 24.
4. Build & run.

## Catatan

- API team ID 583.
- Token di-hardcode; ganti jika expired.
- ViewBinding, Glide untuk image.

## Video Demo Aplikasi

![Video Demo](https://github.com/anas-shn/responsimobile-103/blob/main/file/demo.gif)
