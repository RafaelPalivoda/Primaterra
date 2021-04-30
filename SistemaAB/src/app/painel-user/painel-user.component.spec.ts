import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PainelUserComponent } from './painel-user.component';

describe('PainelUserComponent', () => {
  let component: PainelUserComponent;
  let fixture: ComponentFixture<PainelUserComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ PainelUserComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(PainelUserComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
