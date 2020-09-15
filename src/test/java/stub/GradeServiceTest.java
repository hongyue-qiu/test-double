package stub;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.*;

public class GradeServiceTest {
    /* 需求描述：
    编写GradeService类的单元测试，单元测试calculateAverageGrades方法
    * */

    @Mock
    private GradeSystem gradeSystem;
    @InjectMocks
    private GradeService gradeService;

    @BeforeEach
    public void setUp() {
    }


    @Test
    public void shouldReturn90WhenCalculateStudentAverageGradeAndGradeIs80And90And100() {

        when(gradeSystem.gradesFor(anyLong())).thenReturn(Arrays.asList(80.0,90.0,100.0));

        assertEquals(90.0, gradeService.calculateAverageGrades(gradeSystem.gradesFor(anyLong())));

    }
}
