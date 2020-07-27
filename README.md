[![EssentialsXD](https://i.imgur.com/CP4SZpB.png)](https://EssentialsXD.cf)

[<img alt="Jenkins" src="https://img.shields.io/badge/-Download_from_Jenkins-D24939.svg?logo=jenkins&style=flat-square&logoColor=white" height=32>](http://ci.ender.zone/job/EssentialsXD/)

[<img alt="Discord" src="https://img.shields.io/badge/-Chat_on_Discord-7289DA.svg?logo=discord&style=flat-square&logoColor=white" height=32>](https://discord.gg/casfFyh)

[<img alt="Patreon" src="https://img.shields.io/badge/-Support_on_Patreon-F96854.svg?logo=patreon&style=flat-square&logoColor=white" height=32>](https://www.patreon.com/EssentialsXD)

This is a fork of Essentials called EssentialsXD.

If you are using this, do **NOT** ask Essentials for support.

The official upstream repository is at https://github.com/Essentials/Essentials.


Why use EssentialsXD?
--------

EssentialsXD is an unofficial continuation of Essentials, updated to support modern Minecraft and Spigot versions. It provides several performance enhancements and fixes that are currently not available in Essentials and Spigot-Essentials. [For more details, see the wiki.](https://EssentialsXD.github.io/#/Improvements)

EssentialsXD is almost a completely drop-in replacement for Essentials. However, it has different requirements:

* **EssentialsXD requires [Vault](http://dev.bukkit.org/bukkit-plugins/vault/) to enable chat prefix/suffixes and group support if you have a supported permissions plugin.** We recommend using [LuckPerms](https://luckperms.github.io).

* **If you have an unsupported permissions plugin but still wish to use wildcards, enable `use-bukkit-permissions` in the configuration.** Otherwise, the plugin will fall back to config-based permissions.

* **EssentialsXD requires Java 8 or higher.** On older versions, the plugin may not work properly.

* **EssentialsXD supports Minecraft versions 1.8.8, 1.9.4, 1.10.2, 1.11.2, 1.12.2, 1.13.2, 1.14.4, 1.15.2, and 1.16.1.**


Support
-------

Need help with using EssentialsXD? Join the [MOSS Discord community](https://discord.gg/casfFyh) to ask for help and discuss EssentialsXD.

If you need to report a bug or want to suggest a new feature, you can [open an issue on GitHub](https://github.com/EssentialsXD/Essentials/issues/new/choose).


Building
--------

To build EssentialsXD, you need JDK 8 or higher and Maven installed on your system. Then, run the following command:
```sh
mvn clean install
```

Each module's jar can be found in `target/` inside each module's directory.

Using EssentialsXD in your plugin
--------------------------------

Do you want to integrate with EssentialsXD in your plugin? EssentialsXD is available on the **ender.zone Maven repository** at https://ci.ender.zone/plugin/repository/everything/, and the EssentialsXD artifact is `net.ess3:EssentialsXD:2.17.2`.
More information at the [wiki](https://github.com/EssentialsXD/Essentials/wiki/Common-Issues#how-do-i-add-EssentialsXD-as-a-dependency).


Contributing
------------

Want to help improve EssentialsXD? There are numerous ways you can contribute to the project.

If you'd like to make a financial contribution to the project, you can join our [Patreon](https://www.patreon.com/EssentialsXD/).
If you can't make a donation, don't worry! There's lots of other ways to contribute:

* Do you run a server? Take a look at our ["help wanted" issues](https://github.com/EssentialsXD/Essentials/issues?q=is%3Aissue+is%3Aopen+sort%3Aupdated-desc+label%3A%22help+wanted%22),
  where you can find issues that need extra testing and investigation. You can also join the [MOSS Discord community](https://discord.gg/casfFyh)
  and provide support to others.
* Do you speak multiple languages? If so, we always welcome contributions to our [Crowdin project](https://crowdin.com/project/EssentialsXD-official).
* If you're a developer, you could look through our ["open to PR" issues](https://github.com/EssentialsXD/Essentials/issues?q=is%3Aissue+is%3Aopen+sort%3Aupdated-desc+label%3A%22status%3A+open+to+PR%22).
  We're always happy to receive bug fixes and feature additions as pull requests.
