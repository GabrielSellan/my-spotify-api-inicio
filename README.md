# my-spotify-api-inicio
Construindo minha própria API para o desafio do bootcamp Santander backend Java, com base na tela de inicio do Spotify.

``` mermaid

classDiagram
  class User {
    - name: String
    - sessions: List<PlaylistSession>
  }

  class PlaylistSession {
    - title: String
    - playlists: List<Playlist>
  }

  class Playlist {
    - playlistImage: String
    - playlistName: String
    - creatorName: String
    - songs: List<Song>
  }

  class Song {
    - musicName: String
    - music: String
    - musicImage: String
  }

  User --> PlaylistSession
  PlaylistSession --> Playlist
  Playlist --> Song

```
