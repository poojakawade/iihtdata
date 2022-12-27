import { platformBrowserDynamic } from "@angular/platform-browser-dynamic";
// import { AppModule } from "./01-structure/app.module";
// import { AppModule } from "./02-components/app.module";
// import { AppModule } from "./03-parent-child/app.module";
// import { AppModule } from "./04-databinding/app.module";
import { AppModule } from "./05-service/app.module";
// import { AppModule } from "./06-directives/app.module";
// import { AppModule } from "./07-structural-directives/app.module";
// import { AppModule } from "./08-forms/app.module";
// import { AppModule } from "./09-ajax/app.module";
// import { AppModule } from "./10-routing/app.module";
// import { AppModule } from "./11-routing-nest/app.module";
// import { AppModule } from "./12-routing-param/app.module";

platformBrowserDynamic().bootstrapModule(AppModule)