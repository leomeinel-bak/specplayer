<!-- PROJECT SHIELDS -->

[![Contributors][contributors-shield]][contributors-url]
[![Forks][forks-shield]][forks-url]
[![Stargazers][stars-shield]][stars-url]
[![Issues][issues-shield]][issues-url]
[![MIT License][license-shield]][license-url]
[![Quality][quality-shield]][quality-url]

<!-- PROJECT LOGO -->
<!--suppress ALL -->
<br />
<p align="center">
  <a href="https://github.com/LeoMeinel/specplayer">
    <img src="images/logo.png" alt="Logo" width="80" height="80">
  </a>

<h3 align="center">SpecPlayer</h3>

  <p align="center">
    Spectate Players on Spigot and Paper
    <br />
    <a href="https://github.com/LeoMeinel/specplayer"><strong>Explore the docs »</strong></a>
    <br />
    <br />
    <a href="https://github.com/LeoMeinel/specplayer">View Demo</a>
    ·
    <a href="https://github.com/LeoMeinel/specplayer/issues">Report Bug</a>
    ·
    <a href="https://github.com/LeoMeinel/specplayer/issues">Request Feature</a>
  </p>

<!-- ABOUT THE PROJECT -->

## About The Project

### Description

SpecPlayer is a Spigot Plugin that gives players the ability to spectate others.

This plugin is perfect for any server wanting their staff to spectate their players.

### Features

- Set Staff into spectator mode
- Teleport to players automatically
- Teleport back to the position you came from with the same command

### Built With

- [Gradle 7](https://docs.gradle.org/7.5.1/release-notes.html)
- [OpenJDK 17](https://openjdk.java.net/projects/jdk/17/)

<!-- GETTING STARTED -->

## Getting Started

To get the plugin running on your server follow these simple steps.

### Commands and Permissions

1. Permission: `specplayer.spectate`

- Command: `/spec <player>`
- Description: Spectate a player
- Command: `/spec`
- Description: Stop spectating

### Configuration - messages.yml

```yaml
back: "&fTeleported back to previous location"
no-perms: "&cYou don't have enough permissions!"
player-only: "&cThis command can only be executed by players!"
not-online: "&cPlayer is not online!"
same-player: "&cYou can't spectate yourself!"
```

<!-- ROADMAP -->

## Roadmap

See the [open issues](https://github.com/LeoMeinel/specplayer/issues) for a list of proposed features (and known
issues).

<!-- CONTRIBUTING -->

## Contributing

Contributions are what make the open source community such an amazing place to be, learn, inspire, and create. Any
contributions you make are **greatly appreciated**.

1. Fork the Project
2. Create your Feature Branch (`git checkout -b feature/AmazingFeature`)
3. Commit your Changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the Branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

<!-- LICENSE -->

## License

Distributed under the GNU General Public License v3.0. See `LICENSE` for more information.

<!-- CONTACT -->

## Contact

Leopold Meinel - [leo@meinel.dev](mailto:leo@meinel.dev) - eMail

Project Link - [SpecPlayer](https://github.com/LeoMeinel/specplayer) - GitHub

<!-- ACKNOWLEDGEMENTS -->

### Acknowledgements

- [README.md - othneildrew](https://github.com/othneildrew/Best-README-Template)

<!-- MARKDOWN LINKS & IMAGES -->

[contributors-shield]: https://img.shields.io/github/contributors-anon/LeoMeinel/specplayer?style=for-the-badge
[contributors-url]: https://github.com/LeoMeinel/specplayer/graphs/contributors
[forks-shield]: https://img.shields.io/github/forks/LeoMeinel/specplayer?label=Forks&style=for-the-badge
[forks-url]: https://github.com/LeoMeinel/specplayer/network/members
[stars-shield]: https://img.shields.io/github/stars/LeoMeinel/specplayer?style=for-the-badge
[stars-url]: https://github.com/LeoMeinel/specplayer/stargazers
[issues-shield]: https://img.shields.io/github/issues/LeoMeinel/specplayer?style=for-the-badge
[issues-url]: https://github.com/LeoMeinel/specplayer/issues
[license-shield]: https://img.shields.io/github/license/LeoMeinel/specplayer?style=for-the-badge
[license-url]: https://github.com/LeoMeinel/specplayer/blob/main/LICENSE
[quality-shield]: https://img.shields.io/codefactor/grade/github/LeoMeinel/specplayer?style=for-the-badge
[quality-url]: https://www.codefactor.io/repository/github/LeoMeinel/specplayer
