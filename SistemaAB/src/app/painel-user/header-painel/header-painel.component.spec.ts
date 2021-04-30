import { ComponentFixture, TestBed } from '@angular/core/testing';

import { HeaderPainelComponent } from './header-painel.component';

describe('HeaderPainelComponent', () => {
  let component: HeaderPainelComponent;
  let fixture: ComponentFixture<HeaderPainelComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ HeaderPainelComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(HeaderPainelComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
