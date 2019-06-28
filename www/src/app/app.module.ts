import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import {TasksComponent} from './components/tasks/tasks.component';
import {TasksService} from './components/tasks/tasks.service';
import {HttpClientModule} from '@angular/common/http';
import {FieldComponent} from './components/field/field.component';
import {CommonModule} from "@angular/common";

@NgModule({
  declarations: [
    AppComponent,
    TasksComponent,
    FieldComponent
  ],
  imports: [
    BrowserModule,
    CommonModule,
    HttpClientModule
  ],
  providers: [
    TasksService
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
