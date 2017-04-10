UPDATE: Barnes and Noble has closed their NOOK AppStore, this extension is obsolete.
============


Introduction
============

Nook Shop library is built to provide access to NOOK SHOP Details API.
More info: https://nookdeveloper.zendesk.com/entries/20107613-SHOP-Details-API


Platforms
=========
NOOK Tablet, NOOK HD, NOOK HD+, etc. (Android)


License
=======

NOOK Shop is free, open-source software under the [MIT license](LICENSE.md).


Installation
=======

```haxelib install nook-shop```

Usage
=======

Add
```xml
<haxelib name="nook-shop" />
```
to your application.xml file.

```haxe
import extension.nook.Shop;

...

Shop.details(EAN);
```
