import {Component, Input} from '@angular/core';

@Component({
  selector: 'app-field',
  templateUrl: 'field.component.html',
  styleUrls: ['field.component.scss'],
})
export class FieldComponent {
  @Input() type: 'text' | 'select';
  @Input() value: string;
}
