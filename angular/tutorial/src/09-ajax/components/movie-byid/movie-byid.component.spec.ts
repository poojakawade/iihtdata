import { ComponentFixture, TestBed } from '@angular/core/testing';

import { MovieByidComponent } from './movie-byid.component';

describe('MovieByidComponent', () => {
  let component: MovieByidComponent;
  let fixture: ComponentFixture<MovieByidComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ MovieByidComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(MovieByidComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
