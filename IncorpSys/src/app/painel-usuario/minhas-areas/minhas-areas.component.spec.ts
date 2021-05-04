import { ComponentFixture, TestBed } from '@angular/core/testing';

import { MinhasAreasComponent } from './minhas-areas.component';

describe('MinhasAreasComponent', () => {
  let component: MinhasAreasComponent;
  let fixture: ComponentFixture<MinhasAreasComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ MinhasAreasComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(MinhasAreasComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
