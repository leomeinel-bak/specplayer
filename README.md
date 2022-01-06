<!-- PROJECT SHIELDS -->
[![Contributors][contributors-shield]][contributors-url]
[![Forks][forks-shield]][forks-url]
[![Stargazers][stars-shield]][stars-url]
[![Issues][issues-shield]][issues-url]
[![MIT License][license-shield]][license-url]
[![Quality][quality-shield]][quality-url]

<!-- PROJECT LOGO -->
<br />
<p align="center">
  <a href="https://github.com/TamrielNetwork/SpecPlayer">
    <img src="images/logo.png" alt="Logo" width="80" height="80">
  </a>

<h3 align="center">SpecPlayer</h3>

  <p align="center">
    Spectate Players on Spigot and Paper
    <br />
    <a href="https://github.com/TamrielNetwork/SpecPlayer"><strong>Explore the docs »</strong></a>
    <br />
    <br />
    <a href="https://github.com/TamrielNetwork/SpecPlayer">View Demo</a>
    ·
    <a href="https://github.com/TamrielNetwork/SpecPlayer/issues">Report Bug</a>
    ·
    <a href="https://github.com/TamrielNetwork/SpecPlayer/issues">Request Feature</a>
  </p>

<!-- TABLE OF CONTENTS -->
<details open="open">
  <summary><h2 style="display: inline-block">Table of Contents</h2></summary>
  <ol>
    <li>
      <a href="#about-the-project">About The Project</a>
      <ul>
        <li><a href="#built-with">Built With</a></li>
      </ul>
    </li>
    <li>
      <a href="#getting-started">Getting Started</a>
      <ul>
        <li><a href="#prerequisites">Prerequisites</a></li>
        <li><a href="#installation">Installation</a></li>
      </ul>
    </li>
    <li><a href="#usage">Usage</a></li>
    <li><a href="#roadmap">Roadmap</a></li>
    <li><a href="#contributing">Contributing</a></li>
    <li><a href="#license">License</a></li>
    <li><a href="#contact">Contact</a></li>
    <li><a href="#acknowledgements">Acknowledgements</a></li>
  </ol>
</details>

<!-- ABOUT THE PROJECT -->

## About The Project

### Description

SpecPlayer is a Spectating Plugin, meant for people to be able to spectate other players.

This plugin is perfect for any server wanting their staff to spectate their players.

### Features

* Set Staff into spectator mode
* Teleport to players automatically
* Teleport back to the position you came from with the same command

### Built With

* [Gradle 7](https://docs.gradle.org/7.3.3/release-notes.html)
* [OpenJDK 17](https://openjdk.java.net/projects/jdk/17/)

<!-- GETTING STARTED -->

## Getting Started

To get the plugin running on your server follow these simple steps.

### Commands and Permissions

1. Permission: `specplayer.spectate`

* Command: `/spec <player>`
* Description: Spectate a player
* Command: `/spec`
* Description: Stop spectating

### Configuration - messages.yml

```
no-args: "&7Enter this command to spectate: &b/spec <player>"
player-only: "&cThis command can only be executed by players!"
invalid-option: "&cInvalid option!"
no-perms: "&7You don't have enough permissions!"
invalid-player: "&cInvalid player!"
```

<!-- ROADMAP -->

## Roadmap

See the [open issues](https://github.com/TamrielNetwork/SpecPlayer/issues) for a list of proposed features (and known
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

Leopold Meinel - [@TamrielN](https://twitter.com/TamrielN) - Twitter

Leopold Meinel - [contact@tamriel.me](mailto:contact@tamriel.me) - email

Project Link: [https://github.com/TamrielNetwork/SpecPlayer](https://github.com/TamrielNetwork/SpecPlayer)

<!-- ACKNOWLEDGEMENTS -->

### Acknowledgements

* [README.md - othneildrew](https://github.com/othneildrew/Best-README-Template)

<!-- MARKDOWN LINKS & IMAGES -->

[contributors-shield]: https://img.shields.io/github/contributors-anon/TamrielNetwork/SpecPlayer?style=for-the-badge

[contributors-url]: https://github.com/TamrielNetwork/SpecPlayer/graphs/contributors

[forks-shield]: https://img.shields.io/github/forks/TamrielNetwork/SpecPlayer?label=Forks&style=for-the-badge

[forks-url]: https://github.com/TamrielNetwork/SpecPlayer/network/members

[stars-shield]: https://img.shields.io/github/stars/TamrielNetwork/SpecPlayer?style=for-the-badge

[stars-url]: https://github.com/TamrielNetwork/SpecPlayer/stargazers

[issues-shield]: https://img.shields.io/github/issues/TamrielNetwork/SpecPlayer?style=for-the-badge

[issues-url]: https://github.com/TamrielNetwork/SpecPlayer/issues

[license-shield]: https://img.shields.io/github/license/TamrielNetwork/SpecPlayer?style=for-the-badge

[license-url]: https://github.com/TamrielNetwork/SpecPlayer/blob/main/LICENSE

[quality-shield]: https://img.shields.io/codefactor/grade/github/TamrielNetwork/SpecPlayer?style=for-the-badge

[quality-url]: https://www.codefactor.io/repository/github/TamrielNetwork/SpecPlayer
