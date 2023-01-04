package com.emglab.qlsv.ui.viewmodels.timetable;

import com.emglab.qlsv.dao.TimetableDAO;
import com.emglab.qlsv.repositories.TimeTableRepository;
import dagger.internal.Factory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class TimeTableViewModel_Factory implements Factory<TimeTableViewModel> {
  private final Provider<TimeTableRepository> timeTableRepositoryProvider;

  private final Provider<TimetableDAO> timetableDAOProvider;

  public TimeTableViewModel_Factory(
      Provider<TimeTableRepository> timeTableRepositoryProvider,
      Provider<TimetableDAO> timetableDAOProvider) {
    this.timeTableRepositoryProvider = timeTableRepositoryProvider;
    this.timetableDAOProvider = timetableDAOProvider;
  }

  @Override
  public TimeTableViewModel get() {
    return provideInstance(timeTableRepositoryProvider, timetableDAOProvider);
  }

  public static TimeTableViewModel provideInstance(
      Provider<TimeTableRepository> timeTableRepositoryProvider,
      Provider<TimetableDAO> timetableDAOProvider) {
    return new TimeTableViewModel(timeTableRepositoryProvider.get(), timetableDAOProvider.get());
  }

  public static TimeTableViewModel_Factory create(
      Provider<TimeTableRepository> timeTableRepositoryProvider,
      Provider<TimetableDAO> timetableDAOProvider) {
    return new TimeTableViewModel_Factory(timeTableRepositoryProvider, timetableDAOProvider);
  }

  public static TimeTableViewModel newTimeTableViewModel(
      TimeTableRepository timeTableRepository, TimetableDAO timetableDAO) {
    return new TimeTableViewModel(timeTableRepository, timetableDAO);
  }
}
