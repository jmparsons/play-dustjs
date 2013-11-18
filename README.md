# play-dustjs
This [sbt][sbt] plugin for [Play][play] provides build time compilation for [Dust](https://github.com/linkedin/dustjs) templates.

# Installation

Add the sbt plugin to your `project/plugins.sbt` file:

    addSbtPlugin("com.jmparsons" % "play-dustjs" % "1.5.0")

# Usage

Include the core dust file - can be downloaded from [LinkedIn Dustjs](http://linkedin.github.io/dustjs/) or [here](https://github.com/linkedin/dustjs/tree/master/dist).

    <script src="@routes.Assets.at("javascripts/dust-core-2.2.0.js")"></script>

Place your template **.tl** files into the `app/assets` directory.

Pull in the generated javascript template file:

    <script src="@routes.Assets.at("example.js")"></script>

Render the template:

    $(function() {
      $.get('@routes.Application.data', function(data) {
        console.log('data = ' + JSON.stringify(data));
        dust.render('example', data, function(err, out) {
          $('#dust_pan').html(err ? err : out);
        });
      });
    });

## Changelog

1.5.0 - November 18, 2013

- Upgraded project to work with Play 2.2.x.
- Initialized project, changed package and organization information.
- Updated to full and core 2.2.0 from LinkedIn's dustjs.
- Added tests for valid and non valid template files.
- Updated sample project.

## Credits

This project is a continuation of the Dust plugin from [play-plugins](https://github.com/typesafehub/play-plugins).

## Licence

This software is licensed under the Apache 2 license, quoted below.

Copyright 2012 Typesafe (http://www.typesafe.com).

Licensed under the Apache License, Version 2.0 (the "License"); you may not use this project except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0.

Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License.

[play]: http://www.playframework.org/
[sbt]: https://github.com/harrah/xsbt
