import {ROUTES} from '../../core/api/routes.dictionary';
import {tap} from 'rxjs/operators';
import {Subject} from 'rxjs';
import {HttpClient} from '@angular/common/http';
import {Inject} from '@angular/core';

export interface Task {
  id: string;
  title: string;
  description: string;
}

@Inject({ providedIn: 'root' })
export class TasksService {
  tasks$ = new Subject<Task[]>();

  constructor(
    private httpClient: HttpClient
  ) {}

  fetch() {
    return this.httpClient
      .get(ROUTES.FETCH_TASKS)
      .pipe(tap((tasks: Task[]) => this.tasks$.next(this.fetchMap(tasks))));
  }

  fetchMap(tasks) {
    return tasks.map(task => ({
      ...task,
      type: 'tel'
    }));
  }
}
