import {Component, OnInit} from '@angular/core';
import {TasksService, Task} from './tasks.service';
import {tap} from 'rxjs/operators';

@Component({
  selector: 'app-tasks',
  templateUrl: './tasks.component.html',
  styleUrls: ['./tasks.component.scss']
})
export class TasksComponent implements OnInit {
  tasks: Task[] = [];

  constructor(
    private tasksService: TasksService
  ) {}

  ngOnInit(): void {
    this.tasksService.tasks$
      .pipe(tap((tasks: Task[]) => this.tasks = tasks))
      .subscribe();

    this.tasksService.fetch().subscribe();
  }
}
