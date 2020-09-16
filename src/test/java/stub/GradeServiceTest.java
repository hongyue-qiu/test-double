package stub;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
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

        long id = 1;

        when(gradeSystem.gradesFor(id)).thenReturn(Arrays.asList(80.0, 90.0, 100.0));
        double result = gradeService.calculateAverageGrades(id);

        assertEquals(90.0, result);

    }
}
